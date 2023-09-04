def call () {
  print (10+20)
  sh """
  ls
  mkdir new
  echo "hello" > test.ps1
  cat test.ps1
  ./test.ps1
  """
}
