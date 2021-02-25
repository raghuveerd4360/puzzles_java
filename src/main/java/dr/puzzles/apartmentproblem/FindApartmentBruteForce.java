package dr.puzzles.apartmentproblem;

import java.util.ArrayList;
import java.util.List;

public class FindApartmentBruteForce {

    public List<ApartmentResult> processApartments(List<ApartmentFeatures> apartmentFeaturesList) {
        List<ApartmentResult> apartmentResults = new ArrayList<>();
        for (int i = 0; i < apartmentFeaturesList.size(); i++) {
            ApartmentResult curResult = new ApartmentResult();
            ApartmentFeatures curApartment = apartmentFeaturesList.get(i);

            curResult.gymSteps = curApartment.hasGym ? 0 : null;
            curResult.medicalSteps = curApartment.hasMedical ? 0 : null;
            curResult.storeSteps = curApartment.hasStore ? 0 : null;


            if (i != apartmentFeaturesList.size() - 1) {
                ApartmentFeatures nextApartment = apartmentFeaturesList.get(i + 1);
                if (!curApartment.hasGym && nextApartment.hasGym) {
                    curResult.gymSteps = 1;
                }

                if (!curApartment.hasMedical && nextApartment.hasMedical) {
                    curResult.medicalSteps = 1;
                }

                if (!curApartment.hasStore && nextApartment.hasStore) {
                    curResult.storeSteps = 1;
                }
            }
            apartmentResults.add(curResult);
        }


        // REVERSE

        for (int i = apartmentFeaturesList.size() - 1; i >= 0; i--) {
            ApartmentResult curResult = apartmentResults.get(i);
            ApartmentFeatures curApartment = apartmentFeaturesList.get(i);

            if (i != 0) {
                ApartmentFeatures prevApartment = apartmentFeaturesList.get(i - 1);
                if (!curApartment.hasGym && prevApartment.hasGym) {
                    if (curResult.gymSteps == null) {
                        curResult.gymSteps = 1;
                    } else {
                        curResult.gymSteps = curResult.gymSteps + 1;
                    }
                }

                if (!curApartment.hasStore && prevApartment.hasStore) {
                    if (curResult.storeSteps == null) {
                        curResult.storeSteps = 1;
                    } else {
                        curResult.storeSteps = curResult.storeSteps + 1;
                    }
                }

                if (!curApartment.hasMedical && prevApartment.hasMedical) {
                    if (curResult.medicalSteps == null) {
                        curResult.medicalSteps = 1;
                    } else {
                        curResult.medicalSteps = curResult.medicalSteps + 1;
                    }
                }
            }
        }

        return apartmentResults;
    }
}
