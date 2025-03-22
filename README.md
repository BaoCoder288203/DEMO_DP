Phần 1:	Các lệnh cơ bản thao tác với Docker

	1	docker --version	
![image](https://github.com/user-attachments/assets/41979564-6645-4e80-a228-0ab73d36ad9a)
 	- Cho biết phiên bản hiện tại Docker đang được cài vào máy

   	2	docker run hello-world
![image](https://github.com/user-attachments/assets/5469f602-43cd-4273-8b13-04c1ba4f0aa4)
![image](https://github.com/user-attachments/assets/0b70c83d-0273-4fdb-bd83-ed8ca2e556eb)

  	3	docker pull nginx	    
![image](https://github.com/user-attachments/assets/2f11beeb-089e-45c9-bb7e-90ca93d85a48)
![image](https://github.com/user-attachments/assets/99404a0b-c201-438d-a8c5-e7c3ef1d4f7c)

	4	docker images	
![image](https://github.com/user-attachments/assets/2d5d0373-c420-4660-83bd-f69ddb53d431)

	5	docker run -d nginx	
![image](https://github.com/user-attachments/assets/dd2b6c3e-74ee-49ac-9cf6-045c1f6cd704)
![image](https://github.com/user-attachments/assets/8aa0ae23-9123-4852-a6ec-81e9fcf4e3c4)
![image](https://github.com/user-attachments/assets/bb381594-506b-45c9-a64d-b8c9b6c92f43)

	6	docker ps	
![image](https://github.com/user-attachments/assets/94dcabc3-f9ad-4d00-a1b2-e520f74b0e78)

	7	docker ps -a	
![image](https://github.com/user-attachments/assets/389b479c-119a-452f-848d-02d70a43cf70)

	8	docker logs <container_id>	
![image](https://github.com/user-attachments/assets/e0e9fdad-2009-4f6b-ba71-9abe0f3235af)
![image](https://github.com/user-attachments/assets/a7c5f047-4dd2-4e1c-b211-cb03a4d5ae40)

	9	docker exec -it <container_id> /bin/sh	
![image](https://github.com/user-attachments/assets/d24a9acd-2b64-4fde-8ff0-db7203401007)

	10	docker stop <container_id>	
![image](https://github.com/user-attachments/assets/8a5d31a6-9226-4b22-8057-ec7baf72c111)
![image](https://github.com/user-attachments/assets/6a4df587-e93f-4efa-a8f2-cea0a2e47f8f)

	11	docker restart <container_id>	
![image](https://github.com/user-attachments/assets/582ccc93-9adf-41cb-b18b-62ccb63dfc86)
![image](https://github.com/user-attachments/assets/0ef2d3eb-6a84-4f00-b700-c7db77cfee01)

	12	docker rm <container_id>	
	
![image](https://github.com/user-attachments/assets/3d5bbb4a-4010-46bf-be1f-1632dad23a42)
        - Hiện tại Docker không cho xóa Container này vì nó đang trong trạng thái Run.
	- Để xóa được phải Stop Container đó rồi sau đó mới xóa được.

	13	docker container prune	
![image](https://github.com/user-attachments/assets/291d5f23-10e1-4730-8b0e-143ea9cf5af4)
![image](https://github.com/user-attachments/assets/9f1a423b-5602-416f-9ffa-18b85dd3a619)

	14	docker rmi <image_id>	
![image](https://github.com/user-attachments/assets/a745c5a4-dd79-47d0-8447-39639700512c)
![image](https://github.com/user-attachments/assets/908ec3b3-aeda-4716-8ef3-875afa1482b7)


	15	docker image prune -a	
![image](https://github.com/user-attachments/assets/30ebc93e-0e95-4245-8538-d8b5f8720a6b)
 	- Câu lệnh này sẽ xóa tất cả các Docker images mà không có bất kỳ container nào đang sử dụng chúng.
	- Do hiện tại không có Image nào không được liên kết nên không có Image nào bị xóa.
 
	16	docker run -d -p 8080:80 nginx	
![image](https://github.com/user-attachments/assets/b112ace2-ac9d-487b-9f51-081e50fbcc5a)
![image](https://github.com/user-attachments/assets/4a8caada-760b-48d2-93fc-2760412049b8)

	17	docker inspect <container_id>	
![image](https://github.com/user-attachments/assets/ac573fe7-3516-40f1-b02d-43da9f9a7899)
 	- Cho biết được tất cả các thông tin của 1 Container such as State của Container, Image liên kết với Container,... 

	18	docker run -d -v mydata:/data nginx	
![image](https://github.com/user-attachments/assets/1a7da4eb-37f7-4ec0-b42b-60f1ec889313)
![image](https://github.com/user-attachments/assets/13d07608-ee2e-405a-87ed-806a5d9361e8)
![image](https://github.com/user-attachments/assets/5c9e69b8-f81a-4e84-a835-28b54a546fdc)
![image](https://github.com/user-attachments/assets/afb2edff-5cae-400d-b7a2-22547a65bb23)

	19	docker volume ls
![image](https://github.com/user-attachments/assets/7c2b631a-52ca-49a5-81ba-3c1a016c5773)

	20	docker volume prune	
![image](https://github.com/user-attachments/assets/421da4d3-fa3a-4cfe-bb66-ce1b15480836)
 	- Do hiện tại không có local volume nào mà không được liên kết với ít nhất 1 container nên không có local volume nào được xóa.

	21	docker run -d --name my_nginx nginx
![image](https://github.com/user-attachments/assets/13a26b3f-bbde-48ec-869c-d32d32d8e6ba)
	- Tạo Container với tên my_nginx liên kết với Image có tên nginx.
![image](https://github.com/user-attachments/assets/bfde3305-1f8a-4cd0-ae1a-71e253bce32b)
	- Container sau khi được tạo .
 
	22	docker stats	
![image](https://github.com/user-attachments/assets/70df950a-a644-4926-87a3-4c7271a6a103)

	23	docker network ls
![image](https://github.com/user-attachments/assets/2ccd8da5-ff30-4239-b790-a0b68becdbd2)

	24	docker network create my_network	
![image](https://github.com/user-attachments/assets/b5ef3057-7ace-4b3f-9f23-bb61f210675d)
	- Tạo 1 network mới tên là my_network , để kiểm tra chạy lai lệnh 23 để check.
![image](https://github.com/user-attachments/assets/db4598ce-362c-4e2d-b49e-2d36be061377)

	25	docker run -d --network my_network --name my_container nginx	
![image](https://github.com/user-attachments/assets/55ba7094-695c-4ae5-be06-70fec1dbac87)
	- Tạo thêm 1 Container để kết nối với Network vừa tạo.
![image](https://github.com/user-attachments/assets/7915c2c0-8a7d-4c87-b128-6adf2f0f40ac)
	- Đây là Container vừa được tạo để kết nối với my_network.
 
	26	docker network connect my_network my_nginx	
![image](https://github.com/user-attachments/assets/35e926bf-9b72-4cf9-b0e5-b0cd84c52c7f)
	- Lệnh này giúp kết nối với Container my_nginx.
![image](https://github.com/user-attachments/assets/788a53ed-15d1-4208-9040-662cae469dce)

	27	docker run -d -e MY_ENV=hello_world nginx
![image](https://github.com/user-attachments/assets/1ad385b8-cb72-4275-98a8-a1d8a91c140c)
	- Tạo 1 Container 
![image](https://github.com/user-attachments/assets/7b539788-5952-4a55-8bf7-bf84e8809caa)

	28	docker logs -f my_nginx	
![image](https://github.com/user-attachments/assets/5715dc78-bfa8-4202-bd2c-bd26a2644f17)

	29	FROM nginx	
		COPY index.html /usr/share/nginx/html/index.html
![image](https://github.com/user-attachments/assets/ab1741a8-a425-4108-9389-33e7c5d46f54)
	- Tạo 1 file HTML để có file đẩy lên Docker, file thứ 2 là Dockerfile để cấu hình chạy việc đẩy file lên Docker.

	30	docker build -t my_nginx_image .	
![image](https://github.com/user-attachments/assets/570772a2-ce10-4f84-80c2-c1bbf51d51ef)
	- Chạy lệnh này để bắt đầu việc đẩy file index.html 
 
	31	docker run -d -p 8080:80 my_nginx_image	
![image](https://github.com/user-attachments/assets/5681f8f6-cb42-4ff1-aff7-dfc3da7cc871)

		
Phần 2:	Thao tác với Dockerfile		
	Bài 1: Tạo Dockerfile chạy một ứng dụng Node.js đơn giản		
		Yêu cầu:	
		Viết Dockerfile để chạy một ứng dụng Node.js hiển thị "Hello, Docker!" trên cổng 3000.	
		Sử dụng node:18 làm base image.	
			
	Bài 2: Tạo Dockerfile chạy một ứng dụng Python Flask		
		Yêu cầu:	
		Viết Dockerfile để chạy một ứng dụng Flask hiển thị "Hello, Docker Flask!" trên cổng 5000.	
		Sử dụng python:3.9 làm base image.	
			
	Bài 3: Tạo Dockerfile chạy một ứng dụng React		
		Yêu cầu:	
		Viết Dockerfile để build và chạy một ứng dụng React.	
		Sử dụng node:18-alpine làm base image.	
			
	Bài 4: Tạo Dockerfile chạy một trang web tĩnh bằng Nginx		
		Yêu cầu:	
		Tạo một file index.html đơn giản và sử dụng nginx:latest để phục vụ trang web.	
			
	Bài 5: Tạo Dockerfile cho ứng dụng Go		
		Yêu cầu:	
		Viết Dockerfile để build và chạy một ứng dụng Go đơn giản.	
			
	Bài 6: Sử dụng Multi-stage Build trong Dockerfile		
		Viết Dockerfile để build một ứng dụng Node.js với hai stage:	
		Stage 1: Dùng node:18 để build code.	
		Stage 2: Dùng node:18-alpine để chạy ứng dụng đã build.	
			
	Bài 7: Sử dụng biến môi trường trong Dockerfile		
		Yêu cầu:	
		Viết Dockerfile cho ứng dụng Python đọc biến môi trường APP_ENV và in ra màn hình.	
		Sử dụng ENV APP_ENV=development trong Dockerfile.	
			
	Bài 8: Tạo Dockerfile cho PostgreSQL tùy chỉnh		
		Yêu cầu:	
		Viết Dockerfile để chạy PostgreSQL (postgres:15).	
		Thêm file SQL để tự động tạo database khi container chạy lần đầu tiên.	
			
	Bài 9: Tạo Dockerfile chạy Redis với cấu hình tùy chỉnh		
		Yêu cầu:	
		Viết Dockerfile sử dụng redis:latest.	
		Thêm file redis.conf vào container.	
			
	Bài 10: Chạy ứng dụng PHP với Apache		
		Yêu cầu:	
		Viết Dockerfile để chạy một ứng dụng PHP đơn giản (php:8.2-apache).	
		Mount mã nguồn từ máy host vào container.	
