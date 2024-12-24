public class Bus {
    private int number;
    private String model;
    private int mileage;

    private Bus (Builder builder) {
        this.number = builder.number;
        this.model = builder.model;
        this.mileage = builder.mileage;
    }

    public static class Builder {
        private int number;
        private String model;
        private int mileage;

        public Builder number(int number) {
            this.number = number;
            return this;
        }


        public Builder model (String model) {
            this.model = model;
            return this;
        }


        public Builder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }


        public Bus build() {
            return new Bus(this);

        }
    }
}
