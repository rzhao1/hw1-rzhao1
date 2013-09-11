

/* First created by JCasGen Tue Sep 10 22:28:36 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * XML source: /Users/ranzhao/Documents/workspace/hw1-rzhao1/src/main/resources/hw1-ID-typesystem.xml
 * @generated */
public class Answer extends Source {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: answerId

  /** getter for answerId - gets It indicates the # of the answer.

   * @generated */
  public int getAnswerId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerId);}
    
  /** setter for answerId - sets It indicates the # of the answer.
 
   * @generated */
  public void setAnswerId(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerId, v);}    
   
    
  //*--------------*
  //* Feature: gs

  /** getter for gs - gets It records wheter the answer is correct. 1 is correct and 0 is not correct.
   * @generated */
  public int getGs() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_gs == null)
      jcasType.jcas.throwFeatMissing("gs", "Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_gs);}
    
  /** setter for gs - sets It records wheter the answer is correct. 1 is correct and 0 is not correct. 
   * @generated */
  public void setGs(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_gs == null)
      jcasType.jcas.throwFeatMissing("gs", "Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_gs, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The score is assigned by the component in the pipeline.
   * @generated */
  public int getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score is assigned by the component in the pipeline. 
   * @generated */
  public void setScore(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
  }

    