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
}
