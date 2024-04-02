package Project._0328._3;

public class Reply extends FreeBoard{
    int id;
    String content;
    String loginId;
    int freeBoardId;

    public Reply() {
    }

    public Reply(int id, String content, String loginId, int freeBoardId) {
        this.id = id;
        this.content = content;
        this.loginId = loginId;
        this.freeBoardId = freeBoardId;
    }
    public void createReply(String content, String loginId, int freeBoardId){
        for (int i=0; i<freeBoards.size(); i++){
            if (freeBoardId==freeBoards.get(i).id){
                freeBoards.get(i).replies.add(new Reply(replies.size(),content,loginId,freeBoardId));
                break;
            }
        }
    }


    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String toString(){
        return  id + content + loginId + freeBoardId;
    }
}