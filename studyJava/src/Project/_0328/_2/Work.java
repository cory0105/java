package Project._0328._2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Work {
    public void lectureIdFindLoginId(ArrayList<LectureRegistration> lectureRegistrations, int lectureId){
        for (int i=0; i<lectureRegistrations.size(); i++){
            if (lectureRegistrations.get(i).lectureId == lectureId){
                System.out.println(lectureRegistrations.get(i).userId);
            }
        }
        System.out.println();
    }

    public void loginIdFindTitle(ArrayList<Lecture> lectures, ArrayList<LectureRegistration> lectureRegistrations, String loginId){
        out3:
        for (int i=0; i<lectureRegistrations.size(); i++){
            if (lectureRegistrations.get(i).userId.equals(loginId)){
                for (int j=0; j<lectures.size(); j++){
                    if (lectures.get(j).lectureId == lectureRegistrations.get(i).lectureId){
                        System.out.println(lectures.get(j).getTitle());
                        break out3;
                    }
                }
            }
        }
        System.out.println();
    }

    public void titleFindEmail(ArrayList<User> users, ArrayList<Lecture> lectures,
                                 ArrayList<LectureRegistration> lectureRegistrations, String title){
        int lectureId = -1;
        for (int i=0; i<lectures.size(); i++) {
            if (title.equals(lectures.get(i).title)) {
                lectureId = lectures.get(i).lectureId;
                break;
            }
        }
        if (lectureId < 0) {
            return;
        }
        for (int j=0; j<lectureRegistrations.size(); j++){
            if (lectureId == lectureRegistrations.get(j).lectureId){
                for (int x=0; x<users.size(); x++){
                    if (lectureRegistrations.get(j).userId.equals(users.get(x).loginId)){
                        System.out.println(users.get(x).email);
                        break;
                    }
                }
            }
        }
        System.out.println();
    }

    public void toString(ArrayList<User> users, ArrayList<Lecture> lectures, LectureRegistration lectureRegistration){
        for (int i=0; i<users.size(); i++){
            if (lectureRegistration.userId.equals(users.get(i).loginId)){
                System.out.print(users.get(i).toString() + " - ");
            }
        }
        for (int i=0; i<lectures.size(); i++){
            if (lectureRegistration.lectureId==lectures.get(i).lectureId){
                System.out.println(lectures.get(i).toString());
            }
        }
    }
}
