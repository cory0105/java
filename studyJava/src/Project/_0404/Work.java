package Project._0404;

import java.util.ArrayList;
import java.util.List;

public class Work extends InfoCreate {
    List<String> lectureIdFindLoginId(int lectureId) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == lectureId) {
                strings.add(lectureRegistrations.get(i).getUserId());
            }
        }
        return strings;
    }

    List<String> loginIdFindTitle(String loginId) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).userId.equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).lectureId;
                for (int j = 0; j < lectures.size(); j++) {
                    if (lectures.get(j).lectureId == lectureId) {
                        strings.add(lectures.get(j).getTitle());
                        break;
                    }
                }
            }
        }
        return strings;
    }


    List<String> titleFindEmail1(String title) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < lectures.size(); i++) {
            if (title.equals(lectures.get(i).title)) {
                for (int j = 0; j < lectureRegistrations.size(); j++) {
                    if (lectures.get(i).lectureId == lectureRegistrations.get(j).lectureId) {
                        for (int x = 0; x < users.size(); x++) {
                            if (lectureRegistrations.get(j).userId.equals(users.get(x).loginId)) {
                                strings.add(users.get(x).email);
                                break;
                            }
                        }
                    }
                }
            }
            break;
        }
        return strings;
    }


    List<String> titleFindEmail2(String title) {
        List<String> strings = new ArrayList<>();
        int lectureId = -1;
        for (int i = 0; i < lectures.size(); i++) {
            if (title.equals(lectures.get(i).title)) {
                lectureId = lectures.get(i).lectureId;
                break;
            }
        }
        if (lectureId<0){
            return strings;
        }
        for (int j = 0; j < lectureRegistrations.size(); j++) {
            if (lectureId == lectureRegistrations.get(j).lectureId) {
                for (int x = 0; x < users.size(); x++) {
                    if (lectureRegistrations.get(j).userId.equals(users.get(x).loginId)) {
                        strings.add(users.get(x).email);
                        break;
                    }
                }
            }
        }
        return strings;
    }
    List<Category> loginIdFindCategory(String loginId) {
        List<Category> strings = new ArrayList<>();
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).userId.equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).lectureId;
                for (int j = 0; j < lectures.size(); j++) {
                    if (lectures.get(j).lectureId == lectureId) {
                        strings.add(lectures.get(j).getCategory());
                        break;
                    }
                }
            }
        }
        return strings;
    }

    String getTeacherByLectureId(int lectureId){
        String teacherId = "";
        for (int i=0; i<lectureTeachers.size(); i++){
            if (lectureTeachers.get(i).getLectureId()==lectureId){
                teacherId = lectureTeachers.get(i).getTeacherId();
            }
        }
        for (int j=0; j<teachers.size(); j++){
            if (teachers.get(j).getTeacherId().equals(teacherId)){
                return teachers.get(j).name;
            }
        }
        return "입력값을 다시 확인하시오";
    }

    public ArrayList<String> getLectureTitleListByTeacherId(String teacherId){
        ArrayList<String> lectureTeacher = new ArrayList<>();
        for (int i=0; i<lectureTeachers.size(); i++){
            if (teacherId.equals(lectureTeachers.get(i).getTeacherId())){
                for (int j=0; j<lectures.size(); j++){
                    if (lectureTeachers.get(i).getLectureId()==lectures.get(j).getLectureId()){
                        lectureTeacher.add(lectures.get(j).getTitle());
                    }
                }
            }
        }
        return lectureTeacher;
    }
}
