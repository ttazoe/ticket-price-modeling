package org.example.sample2.domain.audience;

import org.example.sample2.domain.price.PriceCategory;

public class Audience {
    final Age age;
    final Sex sex;
    final StudentCategory studentCategory;
    final boolean isCinemaCitizen;
    final boolean isHandicapped;

    public Audience(final Age age,
                    final Sex sex,
                    final StudentCategory studentCategory,
                    final boolean isCinemaCitizen,
                    final boolean isHandicapped) {
        this.age = age;
        this.sex = sex;
        this.studentCategory = studentCategory;
        this.isCinemaCitizen = isCinemaCitizen;
        this.isHandicapped = isHandicapped;
    }

    public PriceCategory getCategory() {
        // Handicapped 判定
        if (isHandicapped) {
            if (studentCategory == StudentCategory.ELEMENTARYSCHOOL ||
                    studentCategory == StudentCategory.JUNIORHIGHSCHOOL)
                return PriceCategory.HANDICAPPED_UNDER_HIGHSHCHOOL;
            if (studentCategory == StudentCategory.NONE ||
                    studentCategory == StudentCategory.UNIVERSITY)
                return PriceCategory.HANDICAPPED_OVER_HIGHSCHOOL;
        }

        if (isCinemaCitizen) {
            if (age.compareTo(new Age(60)) >= 0) return PriceCategory.CINEMACITIZEN_OVER60;
            if (age.compareTo(new Age(60)) < 0) return PriceCategory.CINEMACITIZEN_REGULAR;
        }

        switch (studentCategory) {
            case ELEMENTARYSCHOOL:
                return PriceCategory.ELEMENTARYSCHOOL_STUDENT;
            case JUNIORHIGHSCHOOL:
                return PriceCategory.JUNIORHIGHSCHOOL_STUDENT;
            case HIGHSCHOOL:
                return PriceCategory.HIGHSCHOOL_STUDENT;
            case UNIVERSITY:
                return PriceCategory.UNIVERSITY_STUDENT;
        }

        if (age.compareTo(new Age(70)) >= 0) {
            return PriceCategory.SENIOR;
        }
        return PriceCategory.REGULAR;
    }
}