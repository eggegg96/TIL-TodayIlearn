git의 기본적인 사용법

초기화
git init

기본 설정
git config --global user.name "username"
git config --global user.email "user@gmail.com"
git global --list

원격저장소 초기화
git remote add origin repo주소

파일 리스트업
git add '파일명.확장자' 
git add .   /해당 폴더 전체 파일 추가

add된 파일들을 local repo에 변경 작업을 하는 것
git commit -m '메모 내용'

원격저장소로 보내고 받고 복제하는 것 
git push origin master 
git pull origin master 
git clone repo주소 

clone과 pull의 차이

clone 명령어

: 내 PC 에 Repositroy 생성 없이, romote 등록 없이 해당 Git Hub Repository 주소에 있는 코드를 단순히 내려받는 명령어

 

pull 명령어

: Git Hub Repository 에 있는 코드를 내 PC 로 업데이트 하는 명령어

 즉, 이미 작업중인 내 PC Repositroy 에 있는 코드에 업데이트 된 Git Hub Repository 에 있는 코드를 업데이트 하는 명령어

 
로컬 저장소에서 새로 갱신된 커밋을 원격 저장소에 갱신하기

1. 로컬 저장소의 파일 내용 갱신
2. Git bash에서 아래 세 개의 명령어를 실행한다.

git add 파일명.확장자

git commit -m "커밋 메시지"

git push origin master 
원격저장소에 푸시한다.