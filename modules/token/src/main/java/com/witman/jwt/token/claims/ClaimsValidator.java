package com.witman.jwt.token.claims;

import com.witman.jwt.token.error.ClaimCollisionException;

public class ClaimsValidator
{
    public static void verifyPrivateClaim(String claim) {
        try {
            var errorMessage = "Claim " + claim + " is not a valid private claim.\n";
            if (RegisteredClaims.CLAIMS.contains(claim)) {
                throw new ClaimCollisionException(errorMessage + "It collides with a known registered claim.\n");
            } else if (PublicClaims.CLAIMS.contains(claim)) {
                throw new ClaimCollisionException(errorMessage + "It collides with a known public claim.\n");
            }
        } catch (ClaimCollisionException ex) {
            ex.printStackTrace();
        }
    }

    public static void verifyPublicClaim(String claim) {
        try {
            if (!PublicClaims.CLAIMS.contains(claim)) {
                var errorMessage = "Claim " + claim + " is not a valid public claim.\n";
                if (RegisteredClaims.CLAIMS.contains(claim)) {
                    errorMessage += "It collides with a known registered claim.\n";
                }
                throw new ClaimCollisionException(errorMessage);
            }
        } catch (ClaimCollisionException ex) {
            ex.printStackTrace();
        }
    }

    public static void verifyRegisteredClaim(String claim) {
        try {
            if (!RegisteredClaims.CLAIMS.contains(claim)) {
                var errorMessage = "Claim " + claim + " is not a valid registered claim.\n";
                if (PublicClaims.CLAIMS.contains(claim)) {
                    errorMessage += "It collides with a known public claim.\n";
                }
                throw new ClaimCollisionException(errorMessage);
            }
        } catch (ClaimCollisionException ex) {
            ex.printStackTrace();
        }
    }
}
