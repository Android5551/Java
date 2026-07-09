### Initialize Git
```
git init
```

### Check what is changed
```
git status
```

### Stage files
```
git add .
```
### Commit
```
git commit -m "Initial commit"
```

### Create a remote repo

### Connect local repo to Github
```
git remote add origin https://github.com/yourusername/jaava.git
```

### If branch is main
```
git push -u origin main
/* The -u option tells Git to remember that your local main branch tracks origin/main. After /that, future pushes can usually be just:
git push
*/
```
#### If not:
#### Create and switch to the java branch:

```
git checkout -b java
```

---

##### If java branch already exists on Github
- Simply switch to it locally and pull it first if needed:
```
git checkout java
```
- push
```
git push origin java
```



### connect your GitHub repository:

```
git remote add origin https://github.com/yourusername/CoreJava.git
```

### Push the java branch:
```
git push -u origin java
```