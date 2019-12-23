package com.example.HMSPHARMACY.DTO;

public class GetDateByDTO {


        private String from;
        private String till;
        private String role;

        public GetDateByDTO()
        {

        }

        public GetDateByDTO(String from, String till, String role) {
            this.from = from;
            this.till = till;
            this.role = role;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTill() {
            return till;
        }

        public void setTill(String till) {
            this.till = till;
        }

}
