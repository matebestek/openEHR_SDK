package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import ehrbase.vita.com.shareddefinition.MathFunctionDefiningcode;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("INTERVAL_EVENT")
public class FirstTestFirstTestIntervalEvent implements FirstTestFirstTestChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0003]/items[at0005]/value|defining_code")
  private LabortestBezeichnungDefiningcode labortestBezeichnungDefiningcode;

  @Path("/data[at0003]/items[at0100]/value|defining_code")
  private TestReasonDefiningcode testReasonDefiningcode;

  @Path("/data[at0003]/items[at0101]/value|value")
  private String testReasonOtherValue;

  @Path("/data[at0003]/items[at0118]")
  private List<Cluster> multimediaDarstellung;

  @Path("/width|value")
  private TemporalAmount widthValue;

  @Path("/state[at0112]/items[at0114]")
  private List<Cluster> strukturierteErfassungDerStorfaktoren;

  @Path("/math_function|defining_code")
  private MathFunctionDefiningcode mathFunctionDefiningcode;

  @Path("/data[at0003]/items[at0122]")
  private List<Cluster> strukturierteTestdiagnostik;

  @Path("/data[at0003]/items[at0065]")
  private List<Cluster> probendetail;

  @Path("/data[at0003]/items[at0097]")
  private List<Cluster> testergebnis;

  @Path("/data[at0003]/items[at0098]")
  private List<FirstTestTestdiagnoseElement> testdiagnose;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setLabortestBezeichnungDefiningcode(
      LabortestBezeichnungDefiningcode labortestBezeichnungDefiningcode) {
     this.labortestBezeichnungDefiningcode = labortestBezeichnungDefiningcode;
  }

  public LabortestBezeichnungDefiningcode getLabortestBezeichnungDefiningcode() {
     return this.labortestBezeichnungDefiningcode ;
  }

  public void setTestReasonDefiningcode(TestReasonDefiningcode testReasonDefiningcode) {
     this.testReasonDefiningcode = testReasonDefiningcode;
  }

  public TestReasonDefiningcode getTestReasonDefiningcode() {
     return this.testReasonDefiningcode ;
  }

  public void setTestReasonOtherValue(String testReasonOtherValue) {
     this.testReasonOtherValue = testReasonOtherValue;
  }

  public String getTestReasonOtherValue() {
     return this.testReasonOtherValue ;
  }

  public void setMultimediaDarstellung(List<Cluster> multimediaDarstellung) {
     this.multimediaDarstellung = multimediaDarstellung;
  }

  public List<Cluster> getMultimediaDarstellung() {
     return this.multimediaDarstellung ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setStrukturierteErfassungDerStorfaktoren(
      List<Cluster> strukturierteErfassungDerStorfaktoren) {
     this.strukturierteErfassungDerStorfaktoren = strukturierteErfassungDerStorfaktoren;
  }

  public List<Cluster> getStrukturierteErfassungDerStorfaktoren() {
     return this.strukturierteErfassungDerStorfaktoren ;
  }

  public void setMathFunctionDefiningcode(MathFunctionDefiningcode mathFunctionDefiningcode) {
     this.mathFunctionDefiningcode = mathFunctionDefiningcode;
  }

  public MathFunctionDefiningcode getMathFunctionDefiningcode() {
     return this.mathFunctionDefiningcode ;
  }

  public void setStrukturierteTestdiagnostik(List<Cluster> strukturierteTestdiagnostik) {
     this.strukturierteTestdiagnostik = strukturierteTestdiagnostik;
  }

  public List<Cluster> getStrukturierteTestdiagnostik() {
     return this.strukturierteTestdiagnostik ;
  }

  public void setProbendetail(List<Cluster> probendetail) {
     this.probendetail = probendetail;
  }

  public List<Cluster> getProbendetail() {
     return this.probendetail ;
  }

  public void setTestergebnis(List<Cluster> testergebnis) {
     this.testergebnis = testergebnis;
  }

  public List<Cluster> getTestergebnis() {
     return this.testergebnis ;
  }

  public void setTestdiagnose(List<FirstTestTestdiagnoseElement> testdiagnose) {
     this.testdiagnose = testdiagnose;
  }

  public List<FirstTestTestdiagnoseElement> getTestdiagnose() {
     return this.testdiagnose ;
  }
}
