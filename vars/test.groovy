// def call () {
//   print (10+20)
//   bat """
//   dir
//   cat > test.bat <<EOF 
//   #!/bin/bash
//   dir
//   mkdir new
//   cd new
//   EOF
//   test.bat
//   """
// }

def call () {
  print (10+20)
  sh """
  ls
  mkdir -p new
  cd new
  cat <<EOF > test.sh
  #!/bin/bash
  ls
  cat test.sh
  EOF"""
  sh """
  cd new
  sudo chmod +x test.sh
  ./test.sh
  """
}
