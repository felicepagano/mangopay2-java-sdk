package com.mangopay.entities;

import com.mangopay.core.enumerations.CountryIso;

import java.util.ArrayList;

import static com.mangopay.core.enumerations.PersonType.NATURAL;

/**
 * Created by thepa on 05-Jul-17.
 */
public class LegacyUserNatural extends User {

    /**
     * First name.
     */
    private String FirstName;

    /**
     * Last name.
     */
    private String LastName;

    /**
     * Address.
     */
    private String Address;

    /**
     * Date of birth (UNIX timestamp).
     */
    private long Birthday;

    /**
     * Place of birth.
     */
    private String Birthplace;

    /**
     * User's country.
     */
    private CountryIso Nationality;

    /**
     * Country of residence.
     */
    private CountryIso CountryOfResidence;

    /**
     * User's occupation.
     */
    private String Occupation;

    /**
     * Income ranges:
     * 1 (-18K€),
     * 2 (18-30K€),
     * 3 (30-50K€),
     * 4 (50-80K€),
     * 5 (80-120K€),
     * 6 (+120K€)
     */
    public static class IncomeRanges {
        public static final Integer Below18 = 1;
        public static final Integer From18To30 = 2;
        public static final Integer From30To50 = 3;
        public static final Integer From50To80 = 4;
        public static final Integer From80To120 = 5;
        public static final Integer Above120 = 6;
    }

    /**
     * Income range. One of UserNatural.IncomeRanges constants.
     */
    private Integer IncomeRange;

    /**
     * Proof of identity.
     */
    protected String ProofOfIdentity;

    /**
     * Proof of address.
     */
    protected String ProofOfAddress;

    /**
     * Instantiates new UserNatural object.
     */
    public LegacyUserNatural() {
        setPersonType(NATURAL);
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public long getBirthday() {
        return Birthday;
    }

    public void setBirthday(long birthday) {
        this.Birthday = birthday;
    }

    public String getBirthplace() {
        return Birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.Birthplace = birthplace;
    }

    public CountryIso getNationality() {
        return Nationality;
    }

    public void setNationality(CountryIso nationality) {
        this.Nationality = nationality;
    }

    public CountryIso getCountryOfResidence() {
        return CountryOfResidence;
    }

    public void setCountryOfResidence(CountryIso countryOfResidence) {
        this.CountryOfResidence = countryOfResidence;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        this.Occupation = occupation;
    }

    public Integer getIncomeRange() {
        return IncomeRange;
    }

    public void setIncomeRange(Integer incomeRange) {
        this.IncomeRange = incomeRange;
    }

    public String getProofOfIdentity() {
        return ProofOfIdentity;
    }

    public void setProofOfIdentity(String proofOfIdentity) {
        this.ProofOfIdentity = proofOfIdentity;
    }

    public String getProofOfAddress() {
        return ProofOfAddress;
    }

    public void setProofOfAddress(String proofOfAddress) {
        this.ProofOfAddress = proofOfAddress;
    }

    /**
     * Gets the collection of read-only fields names.
     *
     * @return List of field names.
     */
    @Override
    public ArrayList<String> getReadOnlyProperties() {

        ArrayList<String> result = super.getReadOnlyProperties();

        result.add("ProofOfIdentity");
        result.add("ProofOfAddress");

        return result;
    }
}
