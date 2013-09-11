
/* First created by JCasGen Tue Sep 10 22:28:36 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Each unit is a combination of a question and a few answers.
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * @generated */
public class Unit_Type extends Source_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Unit_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Unit_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Unit(addr, Unit_Type.this);
  			   Unit_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Unit(addr, Unit_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Unit.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Unit");
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "Unit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "Unit");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerList;
  /** @generated */
  final int     casFeatCode_answerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "Unit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "Unit");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gsNumOfCorrect;
  /** @generated */
  final int     casFeatCode_gsNumOfCorrect;
  /** @generated */ 
  public int getGsNumOfCorrect(int addr) {
        if (featOkTst && casFeat_gsNumOfCorrect == null)
      jcas.throwFeatMissing("gsNumOfCorrect", "Unit");
    return ll_cas.ll_getIntValue(addr, casFeatCode_gsNumOfCorrect);
  }
  /** @generated */    
  public void setGsNumOfCorrect(int addr, int v) {
        if (featOkTst && casFeat_gsNumOfCorrect == null)
      jcas.throwFeatMissing("gsNumOfCorrect", "Unit");
    ll_cas.ll_setIntValue(addr, casFeatCode_gsNumOfCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public float getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "Unit");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, float v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "Unit");
    ll_cas.ll_setFloatValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Unit_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_answerList = jcas.getRequiredFeatureDE(casType, "answerList", "uima.cas.FSList", featOkTst);
    casFeatCode_answerList  = (null == casFeat_answerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerList).getCode();

 
    casFeat_gsNumOfCorrect = jcas.getRequiredFeatureDE(casType, "gsNumOfCorrect", "uima.cas.Integer", featOkTst);
    casFeatCode_gsNumOfCorrect  = (null == casFeat_gsNumOfCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gsNumOfCorrect).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Float", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    