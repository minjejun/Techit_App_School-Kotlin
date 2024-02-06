package StudentManageProject.Controller

import StudentManageProject.Activity.*
import StudentManageProject.util.ProgramState

class MainController {
    // 상태값 담을 프로퍼티 정의
    var programStateValue = ProgramState.PROGRAM_STATE_SHOW_MENU

    // Activity 객체의 주소값을 담을 변수
    lateinit var activity: BaseActivity

    // main 함수가 호출하는 메소드
    fun run() {
        while (true) {
            // 상태에 따른 객체를 생성.
            activity = getStateClass()

            // 초기화 메소드 호출
            activity.initActivity()

            // 처리 메소드 호출
            activity.processActivity()

            // 화면을 출력하는 메소드를 호출.
            activity.showActivity()

            // 현재 상태 종료하는 메소드 호출.
            activity.finishActivity()
        }
    }

    // 상태값에 따라 객체를 생성해 반환하는 메소드
    fun getStateClass() = when(programStateValue) {
        ProgramState.PROGRAM_STATE_SHOW_MENU -> ShowMenuActivity(this)
        ProgramState.PROGRAM_STATE_INPUT_STUDENT_INFO -> InputStudentInfoActivity(this)
        ProgramState.PROGRAM_STATE_SEARCH_STUDENT_INFO -> SearchStudentInfoActivity(this)
        ProgramState.PROGRAM_STATE_SHOW_STUDENT_INFO_ALL -> ShowStudentInfoAllActivity(this)
        ProgramState.PROGRAM_STATE_SHOW_POINT_TOTAL_AVG -> ShowPointTotalAvgActivity(this)
        ProgramState.PROGRAM_STATE_TERMINATE -> TerminateActivity()
    }

    // 상태 값을 변경하는 메소드
    fun setProgramState(programState: ProgramState) {
        this.programStateValue = programState
    }
}