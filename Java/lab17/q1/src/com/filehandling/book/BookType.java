package com.filehandling.book;

public enum BookType {
        HORROR("Horror"),
        SCIFI("Scifi"),
        POLITICS("Politics"),
        ANTHROPOLOGY("Anthropology"),
        SELFHELP("Self-Help"),
        HISTORY("History");

        private String bookType;

        BookType(String bookFullForm){
            this.bookType = bookFullForm;
        }

        public String printBookFullForm(){
            return bookType;
        }
}
