/*
 * 
 */
package caracteristica.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import caracteristica.Atributo;
import caracteristica.Caracteristica;
import caracteristica.diagram.edit.policies.CaracteristicaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class CaracteristicaAtributoReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public CaracteristicaAtributoReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof Caracteristica) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Atributo && newEnd instanceof Caracteristica)) {
			return false;
		}
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistCaracteristicaAtributo_4004(getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Atributo && newEnd instanceof Atributo)) {
			return false;
		}
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistCaracteristicaAtributo_4004(getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getAtributo().remove(getOldTarget());
		getNewSource().getAtributo().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getAtributo().remove(getOldTarget());
		getOldSource().getAtributo().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Caracteristica getOldSource() {
		return (Caracteristica) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Caracteristica getNewSource() {
		return (Caracteristica) newEnd;
	}

	/**
	 * @generated
	 */
	protected Atributo getOldTarget() {
		return (Atributo) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Atributo getNewTarget() {
		return (Atributo) newEnd;
	}
}
