#!/bin/sh
## npm i -g raml2html 
## 生成raml文档，访问网站/doc目录即可查看
if [ -d "src/main/webapp/doc" ]; then
	echo "webapp/doc is already exist"
else
	mkdir src/main/webapp/doc
fi
rm src/main/webapp/doc/index.html
raml2html api.raml > src/main/webapp/doc/index.html
sed -i "s/code.jquery.com\/jquery-1.11.0.min.js/cdn.bootcss.com\/jquery\/1.11.0\/jquery.min.js/g" `grep -rl "code.jquery.com\/jquery-1.11.0.min.js" src/main/webapp/doc`
sed -i "s/cdnjs.cloudflare.com\/ajax\/libs/cdn.bootcss.com/g" `grep -rl "cdnjs.cloudflare.com\/ajax\/libs" src/main/webapp/doc`
sed -i "s/netdna.bootstrapcdn.com/cdn.bootcss.com/g" `grep -rl "netdna.bootstrapcdn.com" src/main/webapp/doc` 
if [ -f "src/main/webapp/doc/index.html" ]; then
	echo "[OK]raml document is created!"
else
	echo "[Error]something wrong"
fi
