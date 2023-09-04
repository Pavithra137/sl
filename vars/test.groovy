def call () {
  print (10+20)
  sh """
  dir
  cat <<EOF > test.bat
  #!/bin/bash
  dir
  mkdir new
  cd new
  EOF
  test.bat
  """
}
