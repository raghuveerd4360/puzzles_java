package dr.puzzles;

import dr.puzzles.apartmentproblem.ApartmentFeatures;
import dr.puzzles.apartmentproblem.ApartmentResult;
import dr.puzzles.apartmentproblem.FindApartmentBruteForce;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindApartmentBruteForceTest {

    public static List<ApartmentFeatures> buildInput() {
        List<ApartmentFeatures> apartmentFeaturesList = new ArrayList<>();
        ApartmentFeatures ap1 = new ApartmentFeatures();
        ap1.hasGym = true;
        ap1.hasMedical = false;
        ap1.hasStore = false;

        ApartmentFeatures ap2 = new ApartmentFeatures();
        ap2.hasGym = false;
        ap2.hasMedical = false;
        ap2.hasStore = true;

        ApartmentFeatures ap3 = new ApartmentFeatures();
        ap3.hasGym = true;
        ap3.hasMedical = false;
        ap3.hasStore = false;

        ApartmentFeatures ap4 = new ApartmentFeatures();
        ap4.hasGym = false;
        ap4.hasMedical = true;
        ap4.hasStore = false;

        ApartmentFeatures ap5 = new ApartmentFeatures();
        ap5.hasGym = false;
        ap5.hasMedical = false;
        ap5.hasStore = true;

        apartmentFeaturesList.add(ap1);
        apartmentFeaturesList.add(ap2);
        apartmentFeaturesList.add(ap3);
        apartmentFeaturesList.add(ap4);
        apartmentFeaturesList.add(ap5);


        return apartmentFeaturesList;
    }

    @Test public void testApartmentFinder() {
        FindApartmentBruteForce findApartmentBruteForce = new FindApartmentBruteForce();
        List<ApartmentResult> apartmentResults = findApartmentBruteForce.processApartments(buildInput());
        System.out.println(apartmentResults.size());
    }
}
