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

git push -u origin master 이 커맨드는 origin이라는 리모트 레포지토리에 master라는 브랜치를 생성하고,
로컬 레포지토리의 master 브랜치의 내용을 리모트 레포지토리의 master 브랜치에 보내라는 뜻.

-u 옵션은 —set-upstream의 줄임말 이 옵션을 쓰면 로컬 레포지토리의 master 브랜치가 리모트 레포지토리의 master 브랜치를 항상 추적하도록(tracking) 하도록 설정된다. 

이런 관계를 tracking connection이라고 한다.(이렇게 tracking connection이 있을 때 리모트 레포지토리의 master 브랜치를 '로컬 레포지토리의 master 브랜치'의 업스트림(upstream) 브랜치라고 함.)
​
이렇게 tracking connection이 설정되면 앞으로 로컬 레포지토리의 master 브랜치에서 단지

git push

라고만 쓰고 실행해도 자동으로 리모트 레포지토리의 master 브랜치에 내용을 전송하고,

git pull

이라고만 쓰고 실행해도 자동으로 리모트 레포지토리의 master 브랜치의 내용을 가져온다.


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

SourceTree

설명란을 보면 왼편에 master, origin/master 등 꼬리표가 붙어 있는데 master는 로컬 저장소 버전을 의미하고 origin/master는 원격저장소의 버전을 의미한다.

git remote add <origin> 호스팅주소

origin은 최초에 git bash에서 입력한 명령어인 위 코드에서 <> 내의 이름이 곧 원격저장소의 이름을 의미한다.

git push origin master 명령어는 origin이라는 리모트 레포지토리에 master 브랜치가 생성되는 것이다.


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

Git에 대한 이해

커밋은 Delta(차이점)가 아닌 SnapShot(스냅사진)

하나의 버전을 만들기 위해 변경사항을 선택하는 과정이 add이고 그렇게 선택한 변경사항을 하나로 묶어 버전으로 만든 것이 commit이다.

해당 commit 버전은 변경사항만을 부분적으로 저장하는게 아닌 변경된 파일이 통째로 저장이 된다.

ex)
ver 1.1
README.txt
1.가나다
2.라마바

   ↓
ver 1.2
README.txt
1.가나다
2.라마바
3.안녕

얼핏 보면 전체를 저장하는 것보다 차이점만 저장하는 것이 훨씬 용량도 작고 빠를 것 같지만 차이점만 저장하는 방식은 버전을 보여줄 때 파일이 만들어졌던 맨 처음까지 거슬러 올라가며 바뀐 점을 모두 반영하는 계산을 해야한다.
예를 들어 README.txt가 100번 바뀌었다면 100번을 모두 계산해야한다.

하지만 전체를 저장하는 방식은 이전 버전과 비교하는 연산을 단 한 번만 하면 된다.


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

Git으로 관리하는 파일의 4가지 형태

1. 추적 안됨 (untracked)
한 번도 커밋되지 않은 파일의 상태

2. 스테이지됨 (staged)
add 명령어를 통해 파일을 스테이지에 올린 상태

3. 수정 없음 (unmodified)
스테이지에 올린 파일을 커밋하고 수정된 적 없는 상태

4. 수정함 (modified)
작업 공간 내에서 파일에 수정이 일어난 경우 