/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcAssemblyPlaceEnum;
import org.bimserver.models.ifc2x3.IfcElementAssembly;
import org.bimserver.models.ifc2x3.IfcElementAssemblyTypeEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcElementAssemblyImpl#getAssemblyPlace <em>Assembly Place</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcElementAssemblyImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElementAssemblyImpl extends IfcElementImpl implements IfcElementAssembly {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcElementAssembly();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAssemblyPlaceEnum getAssemblyPlace() {
		return (IfcAssemblyPlaceEnum)eGet(Ifc2x3Package.eINSTANCE.getIfcElementAssembly_AssemblyPlace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyPlace(IfcAssemblyPlaceEnum newAssemblyPlace) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElementAssembly_AssemblyPlace(), newAssemblyPlace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementAssemblyTypeEnum getPredefinedType() {
		return (IfcElementAssemblyTypeEnum)eGet(Ifc2x3Package.eINSTANCE.getIfcElementAssembly_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcElementAssemblyTypeEnum newPredefinedType) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElementAssembly_PredefinedType(), newPredefinedType);
	}

} //IfcElementAssemblyImpl