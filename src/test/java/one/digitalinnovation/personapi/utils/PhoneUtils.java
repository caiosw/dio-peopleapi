package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {

  private static final String PHONE_NUMBER = "(11)96309-4718";
  private static final PhoneType PHONE_TYPE = PhoneType.HOME;
  private static final long PHONE_ID = 1;


  public static Phone createFakeEntity() {
    return Phone.builder()
            .number(PHONE_NUMBER)
            .type(PHONE_TYPE)
            .build();
  }

  public static PhoneDTO createFakeDTO() {
    return PhoneDTO.builder()
            .number(PHONE_NUMBER)
            .type(PHONE_TYPE)
            .id(PHONE_ID)
            .build();
  }
}
