public class Txt {
    
    TxtListener listener;

    String content;

    public Txt() {
        this.content = "";
    }

    public void edit(String content) {
        this.content = content;
        if(listener != null){
            listener.onTextEdited(this);
        }
    }

    public String viewContent() {
        if(listener != null){
            listener.onShowTxt(this);
        }
        return this.content;
    }

    public void addTxtListener(TxtListener l) {
        this.listener = l;
    }

}
