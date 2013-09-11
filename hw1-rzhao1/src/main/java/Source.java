

/* First created by JCasGen Tue Sep 10 22:28:36 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * XML source: /Users/ranzhao/Documents/workspace/hw1-rzhao1/src/main/resources/hw1-ID-typesystem.xml
 * @generated */
public class Source extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Source.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Source() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Source(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Source(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Source(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: souceId

  /** getter for souceId - gets The id of the source.
   * @generated */
  public int getSouceId() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_souceId == null)
      jcasType.jcas.throwFeatMissing("souceId", "Source");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Source_Type)jcasType).casFeatCode_souceId);}
    
  /** setter for souceId - sets The id of the source. 
   * @generated */
  public void setSouceId(int v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_souceId == null)
      jcasType.jcas.throwFeatMissing("souceId", "Source");
    jcasType.ll_cas.ll_setIntValue(addr, ((Source_Type)jcasType).casFeatCode_souceId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public float getConfidence() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "Source");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Source_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(float v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "Source");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Source_Type)jcasType).casFeatCode_confidence, v);}    
  }

    