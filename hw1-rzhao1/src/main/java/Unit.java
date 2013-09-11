

/* First created by JCasGen Tue Sep 10 22:28:36 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** Each unit is a combination of a question and a few answers.
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * XML source: /Users/ranzhao/Documents/workspace/hw1-rzhao1/src/main/resources/hw1-ID-typesystem.xml
 * @generated */
public class Unit extends Source {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Unit.class);
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
  protected Unit() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Unit(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Unit(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Unit(JCas jcas, int begin, int end) {
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
  //* Feature: question

  /** getter for question - gets 
   * @generated */
  public Question getQuestion() {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "Unit");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Unit_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets  
   * @generated */
  public void setQuestion(Question v) {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "Unit");
    jcasType.ll_cas.ll_setRefValue(addr, ((Unit_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answerList

  /** getter for answerList - gets The sorted order of the answer list. 

   * @generated */
  public FSList getAnswerList() {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "Unit");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Unit_Type)jcasType).casFeatCode_answerList)));}
    
  /** setter for answerList - sets The sorted order of the answer list. 
 
   * @generated */
  public void setAnswerList(FSList v) {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "Unit");
    jcasType.ll_cas.ll_setRefValue(addr, ((Unit_Type)jcasType).casFeatCode_answerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: gsNumOfCorrect

  /** getter for gsNumOfCorrect - gets gs number of the correct answer.
   * @generated */
  public int getGsNumOfCorrect() {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_gsNumOfCorrect == null)
      jcasType.jcas.throwFeatMissing("gsNumOfCorrect", "Unit");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Unit_Type)jcasType).casFeatCode_gsNumOfCorrect);}
    
  /** setter for gsNumOfCorrect - sets gs number of the correct answer. 
   * @generated */
  public void setGsNumOfCorrect(int v) {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_gsNumOfCorrect == null)
      jcasType.jcas.throwFeatMissing("gsNumOfCorrect", "Unit");
    jcasType.ll_cas.ll_setIntValue(addr, ((Unit_Type)jcasType).casFeatCode_gsNumOfCorrect, v);}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets Measure performance by precision

   * @generated */
  public float getPrecision() {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Unit");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Unit_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets Measure performance by precision
 
   * @generated */
  public void setPrecision(float v) {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Unit");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Unit_Type)jcasType).casFeatCode_precision, v);}    
  }

    