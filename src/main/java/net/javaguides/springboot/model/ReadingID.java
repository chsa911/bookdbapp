package net.javaguides.springboot.model;

// Function to generate a number of seven digits
// 1. KW Numeric Class Value of the 1. Character of the keyword = KW String eg. Illuminati = 4
// 2.  Numeric Class Value of the 2. Character of the KW String eg eg. Illuminati = 5
// 3.  Numeric Class Value of the Last Character of the KW String eg. Illuminati = 4
// 4.  Length of the KW String till 9 eg. Illuminati = 9
// 5.  By default 0 If KW length = >9 then value = KW length eg. Illuminati = 1
// 6.  Position of the keyword in the title eg. Illuminati = 0
// 7.  of words in the title eg. Illuminati = 1
// 8.  Times Read By default 0 if read already > 1 read twice 2 eg. Illuminati = 1
// 9.  Numeric class value of the 1 Character of the Authors Last Name eg. Illuminati = 0
// 10.  language: Numeric Value of the language that the book is written in 0 = german 1 = english 2 = französisch 3 portug.
// 11.  CompletionState: default 0 = completed 1 = not completed 2 = Wishlist
// 12.  Type: 0 = Paperback, 1 = Hardcover

// eg. Illuminati = 454.910.110.010
public class ReadingID {
    public int [] ReadingID;
}
