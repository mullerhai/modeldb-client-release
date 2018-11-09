./scripts/gen_thrift_file.sh scala ' ./src/main/scala/thrift/ModelDB.thrift' './src/main/thrift/'
sbt clean && sbt assembly