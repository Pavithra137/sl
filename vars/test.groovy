def call () {
  print (10+20)
  sh """
  ls
  mkdir new
  echo "hello" > test.txt
  cat test.txt
  """
}
