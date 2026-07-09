# Git Basics: Initialize, Commit, and Push

## 1. Initialize Git

```bash
git init
```

Initializes a new Git repository in the current folder.

---

## 2. Check Repository Status

```bash
git status
```

Shows:
- Untracked files
- Modified files
- Staged files
- Current branch

---

## 3. Stage Files

```bash
git add .
```

Stages all changes in the current directory.

---

## 4. Commit Changes

```bash
git commit -m "Initial commit"
```

Creates a commit (snapshot) of the staged changes.

---

## 5. Create a Remote Repository

Create a repository on GitHub (for example, **CoreJava**).

---

## 6. Connect Local Repository to GitHub

```bash
git remote add origin https://github.com/yourusername/CoreJava.git
```

Verify the remote (optional):

```bash
git remote -v
```

---

# Pushing to the `main` Branch

Check your current branch:

```bash
git branch
```

If necessary, rename it to `main`:

```bash
git branch -M main
```

Push to GitHub:

```bash
git push -u origin main
```

> **Note:**  
> The `-u` option sets `origin/main` as the upstream branch. After the first push, future pushes can usually be done with:

```bash
git push
```

---

# Pushing to a `java` Branch

## Create and switch to the branch

```bash
git checkout -b java
```

or (newer Git):

```bash
git switch -c java
```

Push the branch to GitHub:

```bash
git push -u origin java
```

After the first push:

```bash
git push
```

---

# If the `java` Branch Already Exists on GitHub

Fetch the latest branch information:

```bash
git fetch origin
```

Switch to the branch:

```bash
git checkout java
```

If the branch exists only on GitHub (not locally):

```bash
git checkout -b java origin/java
```

or

```bash
git switch --track origin/java
```

Push future commits:

```bash
git push
```

---

# Complete Workflow

## Push to `main`

```bash
git init
git status
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/yourusername/CoreJava.git
git branch -M main
git push -u origin main
```

---

## Push to `java`

```bash
git init
git status
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/yourusername/CoreJava.git
git checkout -b java
git push -u origin java
```