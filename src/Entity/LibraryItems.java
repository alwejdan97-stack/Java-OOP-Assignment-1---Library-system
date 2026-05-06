package Entity;

public class LibraryItems {
    private String id;
    private String title;
    private Boolean isAvilable;

    public void setId(String id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setIsAvilable(boolean isAvilable){
        this.isAvilable=true;
    }
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
}
