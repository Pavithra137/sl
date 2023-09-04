def call () {
  print (10+20)
  sh """
  dir
  mkdir new
  echo "hello" > test.txt
  cat test.txt
  """
}
