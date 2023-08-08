push Error case 1

$ git push origin master
To https://github.com/eggegg96/TIL-TodayIlearn.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/eggegg96/TIL-TodayIlearn.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

기존데이터가 손실될 수 있어서 푸시가 막힌 상황

git psuh origin +master 

위 코드를 이용해서 강제푸시하면 해결