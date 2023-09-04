def call () {
  print (10+20)
  sh """
  ls
  """
  result="'../script.sh'"
}
