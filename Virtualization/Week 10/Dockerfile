FROM golang:1.16 as builder

WORKDIR /app
COPY . .

RUN go mod init go_app
RUN go build -o myapp

FROM alpine:3.14

WORKDIR /app
COPY --from=builder /app/ /app/

EXPOSE 8080
CMD ["go", "run", "/app/my_app"]