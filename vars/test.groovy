def call () {
  print (10+20)
  bat """
  dir
  cat > test.bat <<EOF 
  #!/bin/bash
  dir
  mkdir new
  cd new
  EOF
  test.bat
  """
}
