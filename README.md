# spring-k8s

Build image from commit
```
docker build -t spring-k8s:$(git log --oneline | cut -c 1-7) .
```

Run image
```
docker run -p 8080:8080 --rm -it spring-k8s:$(git log --oneline | cut -c 1-7)
```

```
helm create spring-k8s

helm install --dry-run --debug ./spring-k8s --values ./spring-k8s/values.yaml
```

```
export GIT_HASH=$(git log --oneline | cut -c 1-7) && \
 echo $GIT_HASH && \
  helm install example ./spring-k8s --set name=spring-k8s-${GIT_HASH},container.image=spring-k8s:${GIT_HASH} --values ./spring-k8s/values.yaml --create-namespace=true
```

```
kubectl get all
```

```
kubectl port-forward service/$(kubectl get services | grep backend-service | cut -f 1 -d ' ') 8080:80
```


```
helm history example
```