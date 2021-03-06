package org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-02-16T12:59:53.557782300+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: null"
)
@OptionFor("DV_TEXT")
public class DenwisPainIndicatorDvText implements RMEntity, DenwisPainIndicatorChoice {
  /**
   * Path: open_eREACT-Care/Assessment/DENWIS/Point in time/Pain indicator/Pain indicator
   * Description: Nurse recorded changes in pain.
   */
  @Path("|value")
  private String painIndicatorValue;

  public void setPainIndicatorValue(String painIndicatorValue) {
     this.painIndicatorValue = painIndicatorValue;
  }

  public String getPainIndicatorValue() {
     return this.painIndicatorValue ;
  }
}
