package Test._0404.Methods;

import Test._0404.Data.Category;
import Test._0404.InfoCreate;

import java.util.ArrayList;
import java.util.List;

public class Work extends InfoCreate {
    public List<String> lectureIdFindLoginId(int lectureId) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == lectureId) {
                strings.add(lectureRegistrations.get(i).getUserId());
            }
        }
        return strings;
    }

    public List<String> loginIdFindTitle(String loginId) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getUserId().equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).getLectureId();
                for (int j = 0; j < lectures.size(); j++) {
                    if (lectures.get(j).getLectureId() == lectureId) {
                        strings.add(lectures.get(j).getTitle());
                        break;
                    }
                }
            }
        }
        return strings;
    }


    public List<String> titleFindEmail1(String title) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < lectures.size(); i++) {
            if (title.equals(lectures.get(i).getTitle())) {
                for (int j = 0; j < lectureRegistrations.size(); j++) {
                    if (lectures.get(i).getLectureId() == lectureRegistrations.get(j).getLectureId()) {
                        for (int x = 0; x < users.size(); x++) {
                            if (lectureRegistrations.get(j).getUserId().equals(users.get(x).getLoginId())) {
                                strings.add(users.get(x).getEmail());
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


    public List<String> titleFindEmail2(String title) {
        List<String> strings = new ArrayList<>();
        int lectureId = -1;
        for (int i = 0; i < lectures.size(); i++) {
            if (title.equals(lectures.get(i).getTitle())) {
                lectureId = lectures.get(i).getLectureId();
                break;
            }
        }
        if (lectureId<0){
            return strings;
        }
        for (int j = 0; j < lectureRegistrations.size(); j++) {
            if (lectureId == lectureRegistrations.get(j).getLectureId()) {
                for (int x = 0; x < users.size(); x++) {
                    if (lectureRegistrations.get(j).getUserId().equals(users.get(x).getLoginId())) {
                        strings.add(users.get(x).getEmail());
                        break;
                    }
                }
            }
        }
        return strings;
    }
    public List<Category> loginIdFindCategory(String loginId) {
        List<Category> strings = new ArrayList<>();
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getUserId().equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).getLectureId();
                for (int j = 0; j < lectures.size(); j++) {
                    if (lectures.get(j).getLectureId() == lectureId) {
                        strings.add(lectures.get(j).getCategory());
                        break;
                    }
                }
            }
        }
        return strings;
    }

    public String getTeacherByLectureId(int lectureId){
        String teacherId = "";
        for (int i=0; i<lectureTeachers.size(); i++){
            if (lectureTeachers.get(i).getLectureId()==lectureId){
                teacherId = lectureTeachers.get(i).getTeacherId();
            }
        }
        for (int j=0; j<teachers.size(); j++){
            if (teachers.get(j).getTeacherId().equals(teacherId)){
                return teachers.get(j).getName();
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
