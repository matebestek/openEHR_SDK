package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("POINT_EVENT")
public class ManagementTreatmentScreeningAtTestingPointEvent implements ManagementTreatmentScreeningAtTestingChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0003]/items[at0034]/value|defining_code")
  private ScreeningPurposeDefiningcode screeningPurposeDefiningcode;

  @Path("/data[at0003]/items[at0026]")
  private List<Cluster> additionalDetails;

  @Path("/data[at0003]/items[at0022]")
  private List<PostTestManagementTreatmentScreeningSpecificManagementTreatmentActivityCluster> specificManagementTreatmentActivity;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setScreeningPurposeDefiningcode(
      ScreeningPurposeDefiningcode screeningPurposeDefiningcode) {
     this.screeningPurposeDefiningcode = screeningPurposeDefiningcode;
  }

  public ScreeningPurposeDefiningcode getScreeningPurposeDefiningcode() {
     return this.screeningPurposeDefiningcode ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setSpecificManagementTreatmentActivity(
      List<PostTestManagementTreatmentScreeningSpecificManagementTreatmentActivityCluster> specificManagementTreatmentActivity) {
     this.specificManagementTreatmentActivity = specificManagementTreatmentActivity;
  }

  public List<PostTestManagementTreatmentScreeningSpecificManagementTreatmentActivityCluster> getSpecificManagementTreatmentActivity(
      ) {
     return this.specificManagementTreatmentActivity ;
  }
}
