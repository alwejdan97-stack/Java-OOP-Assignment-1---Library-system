package Entity;

public class Magazine {
    private String editor;
    private String issuNumber;

    public void setEditor(String editor){
        this.editor=editor;
    }
    public String getEditor(){
        return editor;
    }
    public void setIssuNumber(String issuNumber){
        this.issuNumber=issuNumber;
    }
    public String getIsbn(){
        return issuNumber;
    }
}
