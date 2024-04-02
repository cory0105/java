package Project._0328._3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FreeBoard {
    int id;
    String title;
    String content;
    String loginId;
    List<Reply> replies = new LinkedList<>();

    public FreeBoard() {
    }

    public FreeBoard(int id, String title, String content, String loginId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.loginId = loginId;
    }

    static ArrayList<FreeBoard> freeBoards = new ArrayList<>();
    public void createFreeBoard(String title, String content, String loginId){
        freeBoards.add(new FreeBoard(freeBoards.size(), title, content, loginId));
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getLoginId() {
        return loginId;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public String toString(){
        return id + title + content + loginId + replies;
    }
}

