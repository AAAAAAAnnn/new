public class Student {
    private int group;
    private int averageScore;
    private int zachetBook;

    private Student (Builder builder) {
        this.group = builder.group;
        this.averageScore = builder.averageScore;
        this.zachetBook = builder.zachetBook;
    }

    public static class Builder {
        private int group;
        private int averageScore;
        private int zachetBook;

        public Builder group(int group) {
            this.group = group;
            return this;
        }


        public Builder averageScore(int averageScore) {
            this.averageScore = averageScore;
            return this;
        }


        public Builder zachetBook(int zachetBook) {
            this.zachetBook = zachetBook;
            return this;
        }


        public Student build() {
            return new Student(this);

        }
    }
}
