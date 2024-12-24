public class User {
    private String name;
    private String password;
    private String email;

    private User (Builder builder) {
      this.name = builder.name;
      this.password = builder.password;
      this.email = builder.email;
    }

    public static class Builder {
        private String name;
        private String password;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Builder password(String password) {
            this.password = password;
            return this;
        }


        public Builder email(String email) {
            this.email = email;
            return this;
        }


        public User build() {
            return new User(this);

        }
    }
}
