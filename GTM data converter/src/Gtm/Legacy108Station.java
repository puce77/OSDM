/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108 Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108Station#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.Legacy108Station#getBorderPointCode <em>Border Point Code</em>}</li>
 *   <li>{@link Gtm.Legacy108Station#getNameUTF8 <em>Name UTF8</em>}</li>
 *   <li>{@link Gtm.Legacy108Station#getStationCode <em>Station Code</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108Station()
 * @model
 * @generated
 */
public interface Legacy108Station extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getLegacy108Station_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108Station#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Point Code</em>' attribute.
	 * @see #setBorderPointCode(int)
	 * @see Gtm.GtmPackage#getLegacy108Station_BorderPointCode()
	 * @model
	 * @generated
	 */
	int getBorderPointCode();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108Station#getBorderPointCode <em>Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Point Code</em>' attribute.
	 * @see #getBorderPointCode()
	 * @generated
	 */
	void setBorderPointCode(int value);

	/**
	 * Returns the value of the '<em><b>Name UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name UTF8</em>' attribute.
	 * @see #setNameUTF8(String)
	 * @see Gtm.GtmPackage#getLegacy108Station_NameUTF8()
	 * @model
	 * @generated
	 */
	String getNameUTF8();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108Station#getNameUTF8 <em>Name UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name UTF8</em>' attribute.
	 * @see #getNameUTF8()
	 * @generated
	 */
	void setNameUTF8(String value);

	/**
	 * Returns the value of the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Code</em>' attribute.
	 * @see #setStationCode(int)
	 * @see Gtm.GtmPackage#getLegacy108Station_StationCode()
	 * @model
	 * @generated
	 */
	int getStationCode();

	/**
	 * Sets the value of the '{@link Gtm.Legacy108Station#getStationCode <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Code</em>' attribute.
	 * @see #getStationCode()
	 * @generated
	 */
	void setStationCode(int value);

} // Legacy108Station