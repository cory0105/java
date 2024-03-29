package Project._0328._3;

public class Work extends InfoCreate {
    void lectureIdFindLoginId(int lectureId) {
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == lectureId) {
                System.out.println(lectureRegistrations.get(i).getUserId());
            }
        }
        System.out.println();
    }

    void loginIdFindTitle(String loginId) {
        out3:
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).userId.equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).lectureId;
                for (int j = 0; j < lectures.size(); j++) {
                    if (lectures.get(j).lectureId == lectureId) {
                        System.out.println(lectures.get(j).getTitle());
                        break out3;
                    }
                }
            }
        }
        System.out.println();
    }


    void titleFindEmail1(String title) {
        for (int i = 0; i < lectures.size(); i++) {
            if (title.equals(lectures.get(i).title)) {
                for (int j = 0; j < lectureRegistrations.size(); j++) {
                    if (lectures.get(i).lectureId == lectureRegistrations.get(j).lectureId) {
                        for (int x = 0; x < users.size(); x++) {
                            if (lectureRegistrations.get(j).userId.equals(users.get(x).loginId)) {
                                System.out.println(users.get(x).email);
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
    }


    void titleFindEmail2(String title) {
        int lectureId = -1;
        for (int i = 0; i < lectures.size(); i++) {
            if (title.equals(lectures.get(i).title)) {
                lectureId = lectures.get(i).lectureId;
                break;
            }
        }
        if (lectureId<0){
            return;
        }
        for (int j = 0; j < lectureRegistrations.size(); j++) {
            if (lectureId == lectureRegistrations.get(j).lectureId) {
                for (int x = 0; x < users.size(); x++) {
                    if (lectureRegistrations.get(j).userId.equals(users.get(x).loginId)) {
                        System.out.println(users.get(x).email);
                        break;
                    }
                }
            }
        }
    }
    void loginIdFindCategory(String loginId) {
        out3:
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).userId.equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).lectureId;
                for (int j = 0; j < lectures.size(); j++) {
                    if (lectures.get(j).lectureId == lectureId) {
                        System.out.println(lectures.get(j).getCategory());
                        break out3;
                    }
                }
            }
        }
        System.out.println();
    }
}
