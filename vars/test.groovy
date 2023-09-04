def call () {
  print (10+20)
  sh """
  ls
  mkdir new
  echo "hello" > test.sh
  cat test.sh
  ./test.sh
  """
}
