/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymisview;


public class Library {
    
     String bookName;
    String Genre;
    int priceBook;
    int userID;
    String userName;
    String password;
    boolean admin;
    int bookID;
    int issuePeriod;
    String issuedDate;
    
    public Library(){
        bookName = " ";
        Genre = " ";
        priceBook = 0;
        userID = 0;
        userName = "";
        password = "";
        bookID = 0;
        issuePeriod = 0;
        issuedDate = " ";
    }
    
    public void addBook(String bookName, String Genre, int priceBook){
        this.bookName = bookName;
        this.Genre = Genre;
        this.priceBook = priceBook;
        System.out.println("Before pass to librarydao");
         LibraryDAO dao = new LibraryDAO();
         dao.CreateAddBook(bookName, Genre, priceBook);
//        System.out.println(bookName);
    }
    public void issueBook(int bookID, int userID, int issuePeriod, String issuedDate){
        this.bookID = bookID;
        this.userID = userID;
        this.issuePeriod = issuePeriod;
        this.issuedDate = issuedDate;
         LibraryDAO dao = new LibraryDAO();
         dao.CreateIssueBook(bookID, userID, issuePeriod, issuedDate);
    }
    public void addUser(int userID, String userName, String password, boolean admin){
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.admin = admin;
        LibraryDAO dao = new LibraryDAO();
        dao.CreateAddUser(userID, userName, password, admin);
    };
    public void CreateDB(String dbN){
        System.out.println("In library");
        LibraryDAO dao = new LibraryDAO();
        dao.createDatabase(dbN);
    }
    
    public void ReturnBook(int bId, int uId){
        int b = bId;
        int u = uId;
        LibraryDAO dao = new LibraryDAO();
        dao.RetBook(b, u);
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getBookName(){
        return bookName;
    }
    public void setGenre(String Genre){
        this.Genre = Genre;
    }
    public String getGenre(){
        return Genre;
    }
    public void setPrice(int priceBook){
        this.priceBook = priceBook;
    }
    public int getPrice(){
        return priceBook;
    }
    public void setUserID(int userID){
        this.userID = userID;
    }
    public int getUserID(){
        return userID;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setBookId(int bookID){
        this.bookID = bookID;
    }
    public int getBookId(){
        return bookID;
    }
    public void setIssuePeriod(int days)
    {
        issuePeriod = days;
    }
    public int getIssuePeriod(){
        return issuePeriod;
    }
    public void setIssueDate(String issuedDate){
        this.issuedDate = issuedDate;
    }
    
    
}

