package com.witman.jwt.token.claims;

import org.apache.commons.lang3.EnumUtils;

import java.util.Set;

public enum PublicClaims {
    NAME,
    GIVEN_NAME,
    FAMILY_NAME,
    MIDDLE_NAME,
    NICKNAME,
    PREFERRED_USERNAME,
    PROFILE,
    PICTURE,
    WEBSITE,
    EMAIL,
    EMAIL_VERIFIED,
    GENDER,
    BIRTHDATE,
    ZONEINFO,
    LOCALE,
    PHONE_NUMBER,
    PHONE_NUMBER_VERIFIED,
    ADDRESS,
    UPDATED_AT,
    AZP,
    NONCE,
    AUTH_TIME,
    AT_HASH,
    C_HASH,
    ACR,
    AMR,
    SUB_JWK,
    CNF,
    SIP_FROM_TAG,
    SIP_DATE,
    SIP_CALLID,
    SIP_CSEQ_NUM,
    SIP_VIA_BRANCH,
    ORIG,
    DEST,
    MKY,
    EVENTS,
    TOE,
    TXN,
    RPH,
    SID,
    VOT,
    VTM,
    ATTEST,
    ORIGID,
    ACT,
    SCOPE,
    CLIENT_ID,
    MAY_ACT,
    JCARD,
    AT_USE_NBR,
    DIV,
    OPT;

    public static Set<String> claims() {
        return EnumUtils.getEnumMap(PublicClaims.class).keySet();
    }
}
