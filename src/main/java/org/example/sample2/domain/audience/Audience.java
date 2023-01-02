package org.example.sample2.domain.audience;

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

    public AudienceCategory getCategory() {
        // Handicapped 判定
        if (isHandicapped) {
            if (studentCategory == StudentCategory.ELEMENTARYSCHOOL ||
                    studentCategory == StudentCategory.JUNIORHIGHSCHOOL)
                return AudienceCategory.HANDICAPPED_UNDER_HIGHSHCHOOL;
            if (studentCategory == StudentCategory.NONE ||
                    studentCategory == StudentCategory.UNIVERSITY)
                return AudienceCategory.HANDICAPPED_OVER_HIGHSCHOOL;
        }

        if (isCinemaCitizen) {
            if (age.compareTo(new Age(60)) >= 0) return AudienceCategory.CINEMACITIZEN_OVER60;
            if (age.compareTo(new Age(60)) < 0) return AudienceCategory.CINEMACITIZEN_REGULAR;
        }

        switch (studentCategory) {
            case ELEMENTARYSCHOOL:
                return AudienceCategory.ELEMENTARYSCHOOL_STUDENT;
            case JUNIORHIGHSCHOOL:
                return AudienceCategory.JUNIORHIGHSCHOOL_STUDENT;
            case HIGHSCHOOL:
                return AudienceCategory.HIGHSCHOOL_STUDENT;
            case UNIVERSITY:
                return AudienceCategory.UNIVERSITY_STUDENT;
        }

        if (age.compareTo(new Age(70)) >= 0) {
            return AudienceCategory.SENIOR;
        }
        return AudienceCategory.REGULAR;
    }
}

